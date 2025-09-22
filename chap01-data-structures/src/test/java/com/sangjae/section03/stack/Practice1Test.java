package com.sangjae.section03.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/* 괄호 - 백준(9012) */
class Practice1Test {

    Practice1 practice1;

    @BeforeEach
    void setUp() { practice1 = new Practice1(); }

    // 괄호는 무조건 () 열리고 닫힌게 한 짝이다
    // ))) ((( 이렇게 있다고해도 짝이 맞는건 아니다.
    // 옳바른 괄호문자열 ( Valid PS , VPS ) 라고 부른다
    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.arguments("(())())", "NO"),
                Arguments.arguments("(((()())()", "NO"),
                Arguments.arguments("(()())((()))", "YES"),
                Arguments.arguments("((()()(()))(((())))()", "NO"),
                Arguments.arguments("()()()()(()()())()", "YES"),
                Arguments.arguments("(()((())()(", "NO")
        );
    }

    @DisplayName("올바른 괄호 문자열 테스트")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testParenthesisString(String input, String expected) {
        String result = practice1.solution(input);
        Assertions.assertEquals(expected, result);
    }

}