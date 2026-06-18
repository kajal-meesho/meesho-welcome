# KRD: SPSE-5851

## Ticket
- ID: SPSE-5851
- Title: Add /ping endpoint to meesho-welcome service
- Status: Open
- Priority: Major
- Description: The meesho-welcome service needs a lightweight /ping endpoint for uptime checks. It should return a simple JSON response confirming the service is alive.
Acceptance Criteria:
GET /ping returns HTTP 200 with Content-Type: application/json
Response body:
{
  "status": "pong",
  "service": "meesho-welcome"
}
Add a unit test PingControllerTest that verifies 200, content-type, and both JSON fields
No authentication required

## Goal
Add a /ping endpoint that returns HTTP 200 with Content-Type: application/json and body {"status": "pong", "service": "meesho-welcome"}. Include a unit test PingControllerTest that verifies status, content-type, and both JSON fields.

## Decisions made
- /ping implemented as a new controller returning a Map<String, String> for automatic JSON serialization.
- Unit test uses MockMvc and @WebMvcTest(PingController.class) to verify status, content-type, and both JSON fields.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/PingController.java` (java)
- See `src/test/java/com/meesho/welcome/PingControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781801208.355669
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 7/7 tests passed in 8s

## History
- 2026-06-18T16:46:53Z — Mapped repo for SPSE-5851: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-18T16:46:57Z — <@U0B42FAHQ6L>: /kevin SPSE-5851
- 2026-06-18T17:05:00Z — Implemented /ping endpoint and PingControllerTest; emitting READY.
- 2026-06-18T16:47:08Z — Kevin: ## READY: Added /ping endpoint with correct JSON and PingControllerTest covering status, content-type, and fields.
- 2026-06-18T16:47:08Z — AI emitted READY; transitioning to plan review.
- 2026-06-18T16:47:59Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-18T16:48:29Z — <@U0B42FAHQ6L> approved implementation; running test gate.
