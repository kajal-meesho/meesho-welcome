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
- The shop page background remains unchanged.
- Test added to assert the new color is present in the welcome page response.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781611052.219629
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 5/5 tests passed in 5s
- mergeCommitSha: 97271c3d8b6769984a785c30728209b1fb5c6de0
- lastVerdict: ROLLBACK
- lastVerdictReason: auto-rollback (deploy did not stabilize): Command failed (exit=1): docker compose up -d

## History
- 2026-06-16T11:46:35Z — Mapped repo for SPSE-5840: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-16T11:46:39Z — <@U0B42FAHQ6L>: /kevin SPSE-5840
- 2026-06-16T12:00:00Z — Changed welcome page background to #fff0f5 and added test for new color. Emitting READY.
- 2026-06-16T11:46:51Z — Kevin: ## READY: Welcome page background changed to #fff0f5 and test added for new color.
- 2026-06-16T11:46:51Z — AI emitted READY; transitioning to plan review.
- 2026-06-16T11:47:48Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-16T11:48:11Z — Kevin: placeholder retry — regenerated 2 file(s)
- 2026-06-16T11:49:28Z — <@U0B42FAHQ6L> approved implementation; running test gate.
- 2026-06-16T11:49:52Z — PR opened at https://github.com/kajal-meesho/meesho-welcome/pull/5
- 2026-06-16T11:51:10Z — <@U0B42FAHQ6L> clicked Merge; PR #5 merged at 97271c3d8b6769984a785c30728209b1fb5c6de0
- 2026-06-16T11:51:32Z — Canary deploy failed → ROLLED_BACK: Command failed (exit=1): docker compose up -d
- 2026-06-16T11:57:29Z — Auto-restart by user via /kevin — previous status: CANARY_ROLLED_BACK
- 2026-06-16T11:57:29Z — REJECTED plan v12 — user re-invoked /kevin — previous session was CANARY_ROLLED_BACK
- 2026-06-16T11:57:35Z — Mapped repo for SPSE-5840: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-16T11:57:40Z — <@U0B42FAHQ6L>: /kevin SPSE-5840
- 2026-06-16T11:57:56Z — Kevin: ## READY: Welcome page background changed to #fff0f5 and test added for new color.
- 2026-06-16T11:57:56Z — AI emitted READY; transitioning to plan review.
- 2026-06-16T11:58:05Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-16T11:58:25Z — Kevin: placeholder retry — regenerated 2 file(s)
- 2026-06-16T11:58:45Z — <@U0B42FAHQ6L> approved implementation; running test gate.
