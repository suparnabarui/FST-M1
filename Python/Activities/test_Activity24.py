import pytest

# Fixture that initializes the wallet with amount = 0
@pytest.fixture
def wallet():
    return {"amount": 0}

# Parameterized test with the given scenarios
@pytest.mark.parametrize("earned, spent, expected", [
    (30, 10, 20),
    (20, 2, 18),
])
def test_wallet_transactions(wallet, earned, spent, expected):
    # My wallet initially has 0
    assert wallet['amount'] == 0

    # I add {earned} units of cash to the wallet
    wallet['amount'] += earned

    # I spend {spent} units of cash
    wallet['amount'] -= spent

    # I should have {expected} units of cash remaining
    assert wallet['amount'] == expected
