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
Add a /ping endpoint that returns HTTP 200 with Content-Type: application/json and body {"status": "pong", "service": "meesho-welcome", "version": "1.0.0"}. Include a unit test PingControllerTest that verifies status, content-type, and all JSON fields.

## Decisions made
- /ping implemented as a new controller returning a Map<String, String> for automatic JSON serialization.
- Unit test uses MockMvc and @WebMvcTest(PingController.class) to verify status, content-type, and both JSON fields.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/PingController.java` (java)
- See `src/test/java/com/meesho/welcome/PingControllerTest.java` (java)

## State
- state: FEEDBACK_IMPL_REVIEW
- prNumber: 13
- prUrl: https://github.com/kajal-meesho/meesho-welcome/pull/13
- branch: feature/spse-5851-ai-summary
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781801208.355669
- userId: U0B42FAHQ6L
- lastCommentSeen: 2026-06-18T16:51:50Z
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 7/7 tests passed in 8s
- feedbackQueueJson: W3sic291cmNlIjoiR2l0SHViIiwiZ2hDb21tZW50SWQiOjQ3NDQyMzcwMTAsImdoVXNlckxvZ2luIjoia2FqYWwtbWVlc2hvIiwiYm9keSI6ImFkZCBhIFwidmVyc2lvblwiIGZpZWxkIHdpdGggdmFsdWUgXCIxLjAuMFwiIHRvIHRoZSAvcGluZyByZXNwb25zZSIsInNraXBSZWFzb24iOm51bGwsInNraXBwZWRBdCI6bnVsbH0seyJzb3VyY2UiOiJTbGFjayIsImdoQ29tbWVudElkIjpudWxsLCJnaFVzZXJMb2dpbiI6bnVsbCwiYm9keSI6InJlbmFtZSB0aGUgXCJzdGF0dXNcIiBmaWVsZCBmcm9tIFwicG9uZ1wiIHRvIFwiYWxpdmVcIiIsInNraXBSZWFzb24iOm51bGwsInNraXBwZWRBdCI6bnVsbH1d
- activeFeedbackIndex: 0
- feedbackPlanPanelTs: 1781801588.448249
- feedbackImplPanelTs: 1781801654.122569

## History
- 2026-06-18T16:46:53Z — Mapped repo for SPSE-5851: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-18T16:46:57Z — <@U0B42FAHQ6L>: /kevin SPSE-5851
- 2026-06-18T17:05:00Z — Implemented /ping endpoint and PingControllerTest; emitting READY.
- 2026-06-18T16:47:08Z — Kevin: ## READY: Added /ping endpoint with correct JSON and PingControllerTest covering status, content-type, and fields.
- 2026-06-18T16:47:08Z — AI emitted READY; transitioning to plan review.
- 2026-06-18T16:47:59Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-18T16:48:29Z — <@U0B42FAHQ6L> approved implementation; running test gate.
- 2026-06-18T16:49:01Z — PR opened at https://github.com/kajal-meesho/meesho-welcome/pull/13
- 2026-06-18T16:52:47Z — <@U0B42FAHQ6L> started interactive feedback loop: 2 item(s)
- 2026-06-18T16:53:00Z — AI planned: add "version":"1.0.0" to /ping response and test.
- 2026-06-18T16:53:07Z — Kevin: feedback plan 1/2: Plan to add "version":"1.0.0" to /ping response and update its test
- Update `src/main/java/com/meesho/welcome/PingController.java`:
- Add a new field `"version"` with value `"1.0.0"` to the JSON r…
- 2026-06-18T16:53:49Z — <@U0B42FAHQ6L> approved feedback plan 1
- 2026-06-18T16:54:30Z — AI implemented: added "version":"1.0.0" to /ping response and updated PingControllerTest.
- 2026-06-18T16:54:09Z — Kevin: feedback impl 1/2: Add "version":"1.0.0" to /ping response and update PingControllerTest to verify it.
- 2026-06-18T16:54:52Z — <@U0B42FAHQ6L> approved feedback impl 1
