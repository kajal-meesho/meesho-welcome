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
Change the welcome page background color to #fff0f5 (light pink) and add a test to assert this.

## Decisions made
- Only the GET / (welcome page) background is changed to #fff0f5; /shop remains unchanged.
- Test added to assert the presence of "background: #fff0f5;" in the response body.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781606180.091699
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 1/1 tests passed in 7s

## History
- 2026-06-16T10:36:17Z — Auto-restart by user via /kevin — previous status: WORKING
- 2026-06-16T10:36:17Z — REJECTED plan v1 — user re-invoked /kevin — previous session was WORKING
- 2026-06-16T10:36:13Z — Mapped repo for SPSE-5840: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-16T10:36:18Z — <@U0B42FAHQ6L>: /kevin SPSE-5840
- 2026-06-16T10:45:00Z — Changed welcome page background to #fff0f5 and added test for color; emitting READY.
- 2026-06-16T10:36:28Z — Kevin: ## READY: Welcome page background changed to #fff0f5 and test added for color.
- 2026-06-16T10:36:28Z — AI emitted READY; transitioning to plan review.
- 2026-06-16T10:36:28Z — Kevin: ## READY: Welcome page background changed to #fff0f5 and test added for color.
- 2026-06-16T10:36:24Z — Mapped repo for SPSE-5840: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-16T10:36:24Z — <@U0B42FAHQ6L>: /kevin SPSE-5840
- 2026-06-16T10:38:00Z — Changed welcome page background to #fff0f5 and added test for color; emitting READY.
- 2026-06-16T10:36:34Z — Kevin: ## READY: Welcome page background changed to #fff0f5 and test added for color
- 2026-06-16T10:36:34Z — AI emitted READY; transitioning to plan review.
- 2026-06-16T10:36:34Z — Kevin: ## READY: Welcome page background changed to #fff0f5 and test added for color
- 2026-06-16T10:37:19Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-16T10:37:33Z — Kevin: placeholder retry — regenerated 2 file(s)
- 2026-06-16T10:38:33Z — <@U0B42FAHQ6L> approved implementation; running test gate.
