# KRD: SPSE-5849

## Ticket
- ID: SPSE-5849
- Title: Add /health JSON endpoint to meesho-welcome service
- Status: Open
- Priority: Major
- Description: Description: The meesho-welcome Spring Boot service currently only serves HTML pages (/ and /shop). Add a /health REST endpoint that returns a JSON response so monitoring tools and Kevin's canary probe can verify the service is alive without parsing HTML.
Acceptance Criteria:
GET /health returns HTTP 200
Response body is JSON: {"status": "ok", "service": "meesho-welcome"}
Response Content-Type is application/json
GET / and GET /shop are not affected
A test asserts /health returns status 200 and body contains "status": "ok"

## Goal
Add a /health endpoint that returns JSON: {"status": "ok", "service": "meesho-welcome"} with HTTP 200 and Content-Type application/json, without affecting / or /shop.

## Decisions made
- The /health endpoint returns a Map<String, String> for automatic JSON serialization.
- Test updated to assert status 200, Content-Type application/json, and correct JSON body.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781796355.363039
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 6/6 tests passed in 7s

## History
- 2026-06-18T15:25:59Z — Mapped repo for SPSE-5849: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-18T15:26:03Z — <@U0B42FAHQ6L>: /kevin SPSE-5849
- 2026-06-18T15:32:00Z — Implemented /health JSON endpoint and updated test; emitting READY.
- 2026-06-18T15:26:29Z — Kevin: ## READY: /health endpoint returns correct JSON, test updated for "ok" status.
- 2026-06-18T15:26:29Z — AI emitted READY; transitioning to plan review.
- 2026-06-18T15:27:19Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-18T15:28:15Z — <@U0B42FAHQ6L> approved implementation; running test gate.
