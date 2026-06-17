# KRD: SPSE-5844

## Ticket
- ID: SPSE-5844
- Title: Change welcome page background color to light blue
- Status: Open
- Priority: Major
- Description: The GET / welcome page currently has a light pink background (#fff0f5). Change it to a light blue (#e8f4fd) to align with the updated brand palette.
Acceptance Criteria:
GET / HTML contains background or background-color with value #e8f4fd
The previous pink background (#fff0f5) is removed — not duplicated
A test asserts the new color string #e8f4fd is present in the GET / response body
GET /shop page is not affected

## Goal
Change the GET / welcome page background color to the requested blue, remove the old pink (#fff0f5), and add a test asserting the new color. The shop page is not affected.

## Decisions made
- Only the GET / (welcome page) background is changed to the requested blue.
- The previous pink (#fff0f5) is fully replaced, not duplicated.
- The GET /shop page background remains unchanged.
- The test now asserts the presence of the new color in the GET / response.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781698972.057909
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 6/6 tests passed in 8s

## History
- 2026-06-17T12:22:55Z — Mapped repo for SPSE-5844: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-17T12:23:00Z — <@U0B42FAHQ6L>: /kevin SPSE-5844
- 2026-06-17T12:45:00Z — Welcome page background changed to light blue (#e8f4fd), test updated to assert new color. Emitting READY.
- 2026-06-17T12:23:22Z — Kevin: ## READY: Welcome page background changed to light blue (#e8f4fd), test updated to assert new color.
- 2026-06-17T12:23:22Z — AI emitted READY; transitioning to plan review.
- 2026-06-17T12:23:55Z — <@U0B42FAHQ6L> requested revision at plan: change color to dark blue
- 2026-06-17T12:23:59Z — <@U0B42FAHQ6L>: User reviewed the plan and asked you to revise: change color to dark blue — please update the plan/code, keep approved decisions intact, and emit ## READY again.
- 2026-06-17T12:46:00Z — Kevin: Welcome page background changed to dark blue (#0a2540), test updated to assert new color. Emitting READY.
- 2026-06-17T12:24:59Z — Kevin: ## READY: Welcome page background changed to dark blue (#0a2540), test updated to assert new color.
- 2026-06-17T12:24:59Z — AI emitted READY; transitioning to plan review.
- 2026-06-17T12:26:26Z — <@U0B42FAHQ6L> requested revision at plan: change the color to #003366
- 2026-06-17T12:26:35Z — <@U0B42FAHQ6L> requested revision at plan: change the color to #003366
- 2026-06-17T12:26:39Z — <@U0B42FAHQ6L>: User reviewed the plan and asked you to revise: change the color to #003366 — please update the plan/code, keep approved decisions intact, and emit ## READY again.
- 2026-06-17T12:47:00Z — Kevin: Welcome page background changed to #003366, test updated to assert new color. Emitting READY.
- 2026-06-17T12:27:03Z — Kevin: ## READY: Welcome page background changed to #003366, test updated to assert new color.
- 2026-06-17T12:27:03Z — AI emitted READY; transitioning to plan review.
- 2026-06-17T12:26:29Z — <@U0B42FAHQ6L>: User reviewed the plan and asked you to revise: change the color to #003366 — please update the plan/code, keep approved decisions intact, and emit ## READY again.
- 2026-06-17T12:27:00Z — Kevin: Welcome page background changed to #003366 (dark blue), test updated to assert new color. Emitting READY.
- 2026-06-17T12:27:07Z — Kevin: ## READY: Welcome page background changed to #003366 (dark blue), test updated to assert new color.
- 2026-06-17T12:27:07Z — AI emitted READY; transitioning to plan review.
- 2026-06-17T12:27:03Z — Kevin: ## READY: Welcome page background changed to #003366, test updated to assert new color.
- 2026-06-17T12:27:07Z — Kevin: ## READY: Welcome page background changed to #003366 (dark blue), test updated to assert new color.
- 2026-06-17T12:27:37Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-17T12:27:52Z — <@U0B42FAHQ6L> approved implementation; running test gate.
