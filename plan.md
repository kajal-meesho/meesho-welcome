# KRD: SPSE-5850

## Ticket
- ID: SPSE-5850
- Title: Add /about endpoint to meesho-welcome service
- Status: Open
- Priority: Major
- Description: The meesho-welcome Spring Boot service currently only has a /health endpoint. Add a /about endpoint that returns a JSON response with basic service metadata.
Acceptance Criteria:
GET /about returns HTTP 200 with Content-Type: application/json
Response body contains:
{
  "service": "meesho-welcome",
  "team": "supplier-service",
  "version": "1.0.0",
  "description": "Meesho welcome page service"
}
Add a unit test AboutControllerTest that verifies the endpoint returns 200 and the correct JSON fields
No authentication required — endpoint is public

## Goal
Expose a public /about endpoint returning service metadata as JSON, with a unit test verifying the response.

## Decisions made
- /about implemented as a new controller returning a Map<String, String> for auto-JSON serialization.
- Unit test AboutControllerTest covers HTTP 200, content-type, and all required fields.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/AboutController.java` (java)
- See `src/test/java/com/meesho/welcome/AboutControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781799087.764589
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 7/7 tests passed in 7s

## History
- 2026-06-18T16:11:32Z — Mapped repo for SPSE-5850: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-18T16:11:38Z — <@U0B42FAHQ6L>: /kevin SPSE-5850
- 2026-06-18T16:20:00Z — Implemented /about endpoint and AboutControllerTest; emitting READY.
- 2026-06-18T16:11:50Z — Kevin: ## READY: Added /about endpoint with JSON metadata and unit test AboutControllerTest
- 2026-06-18T16:11:50Z — AI emitted READY; transitioning to plan review.
- 2026-06-18T16:12:24Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-18T16:13:50Z — <@U0B42FAHQ6L> approved implementation; running test gate.
