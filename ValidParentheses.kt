package com.example.leetcodesolution

import java.util.*

/**
 * <pre>
 * author : 王磊
 * time   : 2019-10-29
 * version: 1.0
</pre> *
 */
internal class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<String>()
        for (i in 0 until s.length) {
            val character = s[i]
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character.toString())
            } else if (!stack.isEmpty() && (character == ')' || character == ']' || character == '}')) {
                if (isCouple(stack.peek(), character.toString())) {
                    stack.pop()
                } else {
                    return false
                }
            } else {
                return false
            }
        }
        return stack.isEmpty()
    }

    private fun isCouple(left: String, right: String): Boolean {
        return (left == "(" && right == ")"
                || left == "[" && right == "]"
                || left == "{" && right == "}")
    }
}