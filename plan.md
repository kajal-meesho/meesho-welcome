# KRD: SPSE-5841

## Ticket
- ID: SPSE-5841
- Title: Personalize welcome page greeting to include user name
- Status: Open
- Priority: Major
- Description: The GET / welcome page currently displays a generic heading "Welcome to Meesho".
Change it to "Welcome to Meesho, Kajal" to personalize the greeting.

Acceptance Criteria:
- GET / HTML contains the text "Welcome to Meesho, Kajal"
- The old heading "Welcome to Meesho" (without the name) is replaced — not duplicated
- A test asserts the personalized greeting string is present in the GET / response
- The shop page (GET /shop) is not affected

## Goal
Personalize the welcome page greeting to "Welcome to Meesho, Kajal" and ensure a test asserts this string is present in the GET / response.

## Decisions made
- Only the GET / (welcome page) greeting is changed to include the name "Kajal".
- The shop page (GET /shop) is not affected.
- A new test asserts the personalized greeting is present in the response.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781613836.193799
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 6/6 tests passed in 5s

## History
- 2026-06-16T12:43:59Z — Mapped repo for SPSE-5841: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-16T12:44:04Z — <@U0B42FAHQ6L>: /kevin SPSE-5841
- 2026-06-16T12:55:00Z — Personalized greeting "Welcome to Meesho, Kajal" shipped and test added. Emitting READY.
- 2026-06-16T12:44:31Z — Kevin: ## READY: Personalized greeting "Welcome to Meesho, Kajal" on welcome page and test added.
- 2026-06-16T12:44:31Z — AI emitted READY; transitioning to plan review.
- 2026-06-16T12:44:46Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-16T12:45:32Z — Kevin: placeholder retry — regenerated 2 file(s)
- 2026-06-16T12:45:59Z — <@U0B42FAHQ6L> approved implementation; running test gate.
