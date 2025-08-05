# test_calculator.py
import pytest

def test_sum():
    a = 10
    b = 5
    result = a + b
    assert result == 15

def test_difference():
    a = 10
    b = 5
    result = a - b
    assert result == 5

def test_product():
    a = 10
    b = 5
    result = a * b
    assert result == 50


def test_quotient():
    a = 10
    b = 5
    result = a / b
    assert result == 2.0
