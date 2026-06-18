# KRD: SPSE-5845

## Ticket
- ID: SPSE-5845
- Title: Style the shop page "Back to Home" button with dark green color
- Status: Open
- Priority: Major
- Description: The GET /shop page has a "Back to Home" anchor/button. Change its background color to a dark green (e.g. #1a7a1a or similar dark green) and set the text color to #ffffff so it renders as a clearly styled button.
Acceptance Criteria:
GET /shop HTML contains background or background-color with a dark green value on the "Back to Home" button element (inline or stylesheet)
The button text color is set to #ffffff
A test asserts the dark green color string is present in the GET /shop response body
GET / (home page) Start Shopping CTA is not affected

## Goal
Style the "Back to Home" button on the /shop page with a dark green background (#1a7a1a) and white text (#ffffff), without affecting the home page CTA. Add a test to assert the color is present in the /shop response.

## Decisions made
- Used #1a7a1a for the dark green background.
- Used #ffffff for the button text color.
- Only the /shop page's .back button is changed; the home page CTA is not affected.
- Test added to assert "background: #1a7a1a" is present in the /shop response.
- Button text changed from "Back to Home" to "Home Page" as per feedback.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: WORKING
- prNumber: 10
- prUrl: https://github.com/kajal-meesho/meesho-welcome/pull/10
- branch: feature/spse-5845-ai-summary
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781787416.250879
- userId: U0B42FAHQ6L
- lastCommentSeen: 2026-06-18T13:06:48Z
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 7/7 tests passed in 5s

## History
- 2026-06-18T12:57:00Z — Mapped repo for SPSE-5845: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-18T12:57:04Z — <@U0B42FAHQ6L>: /kevin SPSE-5845
- 2026-06-18T13:10:00Z — Shop page "Back to Home" button styled dark green (#1a7a1a) with white text; test added for color. Emitting READY.
- 2026-06-18T12:57:30Z — Kevin: ## READY: Shop page "Back to Home" button styled dark green (#1a7a1a) with white text; test added for color.
- 2026-06-18T12:57:30Z — AI emitted READY; transitioning to plan review.
- 2026-06-18T12:57:44Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-18T12:58:12Z — Kevin: placeholder retry — regenerated 2 file(s)
- 2026-06-18T12:58:24Z — <@U0B42FAHQ6L> approved implementation; running test gate.
- 2026-06-18T12:58:49Z — PR opened at https://github.com/kajal-meesho/meesho-welcome/pull/10
- 2026-06-18T13:11:00Z — Button text changed from "Back to Home" to "Home Page" as per feedback; all styling and tests preserved. Emitting READY.
- 2026-06-18T13:07:57Z — Addressed feedback (GitHub): can you also change the button text from "Back to Home" to "Home Page"
