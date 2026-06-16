# KRD: SPSE-5840

## Ticket
- ID: SPSE-5840
- Title: Change welcome page background to light pink
- Status: Open
- Priority: Major
- Description: The GET / response currently has a white background. Change the background color of the welcome page to #fff0f5 (light pink).
Acceptance Criteria:
GET / HTML contains background-color: #fff0f5 or background:#fff0f5
A test asserts the new background color string is present in the response body

## Goal
Change the welcome page background color to #fff0f5 (light pink) and ensure a test asserts this color is present in the response.

## Decisions made
- Only the GET / (welcome page) background is changed to #fff0f5.
- The /shop page background remains unchanged.
- Test added to assert the new background color string is present in the response.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781607483.341299
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 5/5 tests passed in 7s

## History
- 2026-06-16T10:57:59Z — Auto-restart by user via /kevin — previous status: WORKING
- 2026-06-16T10:57:59Z — REJECTED plan v1 — user re-invoked /kevin — previous session was WORKING
- 2026-06-16T10:57:53Z — Mapped repo for SPSE-5840: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-16T10:57:57Z — <@U0B42FAHQ6L>: /kevin SPSE-5840
- 2026-06-16T11:05:00Z — Changed welcome page background to #fff0f5 and added test for color; emitting READY.
- 2026-06-16T10:58:08Z — Kevin: ## READY: Welcome page background changed to #fff0f5 and test added for color
- 2026-06-16T10:58:08Z — AI emitted READY; transitioning to plan review.
- 2026-06-16T10:58:08Z — Kevin: ## READY: Welcome page background changed to #fff0f5 and test added for color
- 2026-06-16T10:58:07Z — Mapped repo for SPSE-5840: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-16T10:58:07Z — <@U0B42FAHQ6L>: /kevin SPSE-5840
- 2026-06-16T11:01:00Z — Changed welcome page background to #fff0f5 and added test for color string; emitting READY.
- 2026-06-16T10:58:18Z — Kevin: ## READY: Welcome page background changed to #fff0f5 and test added for color string
- 2026-06-16T10:58:18Z — AI emitted READY; transitioning to plan review.
- 2026-06-16T10:58:18Z — Kevin: ## READY: Welcome page background changed to #fff0f5 and test added for color string
- 2026-06-16T10:58:50Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-16T10:59:16Z — Kevin: placeholder retry — regenerated 2 file(s)
- 2026-06-16T11:00:25Z — <@U0B42FAHQ6L> approved implementation; running test gate.
