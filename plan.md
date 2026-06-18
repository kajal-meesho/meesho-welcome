# KRD: SPSE-5848

## Ticket
- ID: SPSE-5848
- Title: Change homepage heading from "Welcome to Meesho, Kajal" to "Welcome Guys"
- Status: Open
- Priority: Major
- Description: Update the heading text on the Meesho homepage.
Current: Welcome to Meesho, Kajal Expected: Welcome Guys
Acceptance Criteria:
Heading text on the homepage reads Welcome Guys

## Goal
Update the homepage heading text from "Welcome to Meesho, Kajal" to "Welcome Guys" as per the acceptance criteria.

## Decisions made
- Only the heading text on the homepage is changed.
- The test asserting the greeting is updated to expect "Welcome Guys".

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781779573.271469
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 6/6 tests passed in 5s

## History
- 2026-06-18T10:46:17Z — Mapped repo for SPSE-5848: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-18T10:46:21Z — <@U0B42FAHQ6L>: /kevin SPSE-5848
- 2026-06-18T11:05:00Z — Homepage heading changed from "Welcome to Meesho, Kajal" to "Welcome Guys", test updated. Emitting READY.
- 2026-06-18T10:46:44Z — Kevin: ## READY: Homepage heading changed from "Welcome to Meesho, Kajal" to "Welcome Guys".
- 2026-06-18T10:46:44Z — AI emitted READY; transitioning to plan review.
- 2026-06-18T10:47:15Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-18T10:48:01Z — Kevin: placeholder retry — regenerated 2 file(s)
- 2026-06-18T10:48:32Z — <@U0B42FAHQ6L> approved implementation; running test gate.
