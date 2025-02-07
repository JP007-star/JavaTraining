Test Double are replacing production obj for testing purpose

Fake   --> FakeRepos instead main db using in memory database
Dummy  --> doesn't have any business logic ,just passing for code to compile
Stub   --> predefined answers to method execution made during test // behavior is hardcoded for particular test  // instead of calling external will call stub to get expected response
Mock   --> mock obj record method calls and verify later records calls match
Spy    --> similar to stub only diff they record ,how they executed
