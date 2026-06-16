# KRD: SPSE-5838 — Add a footer to all pages in meesho-welcome

## Ticket
- ID: SPSE-5838
- Title: Add a footer to all pages in meesho-welcome
- Status: Open
- Priority: Major
- Description: Currently the welcome page (GET /) and shop page (GET /shop) have no footer.

Add a consistent footer to both pages containing:
  - The text "© 2026 Meesho. All rights reserved."
  - Styled to match the existing pink theme (#f43397)
  - Full-width bar at the bottom of every page

The footer should appear on both the / page and the /shop page.
Also add a test that verifies the footer text is present on the welcome page.

Repo: https://github.com/kajal-meesho/meesho-welcome
Acceptance Criteria:
- GET / response contains "© 2026 Meesho"
- GET /shop response contains "© 2026 Meesho"
- WelcomeControllerTest has a test asserting the footer is present
- All existing tests still pass

## Goal
Add a footer styled with the pink theme to both pages, and a corresponding unit test for the welcome page.

## Decisions made
- 2026-06-16 — Footer HTML: `<footer>` with the copyright text, styled with pink background, white text, centered.
- 2026-06-16 — Copyright symbol: use `\u00a9` in Java string so the raw response contains the actual © character (test can match directly).
- 2026-06-16 — Only one new test added (welcome page footer); shop page footer verified by the existing `shopPageLoads` extended implicitly (no separate test required by AC).

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781602263.827569
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: 5/5 tests passed in 5s

## History
- 2026-06-16T09:31:00Z — Auto-restart by user via /kevin — previous status: WORKING
- 2026-06-16T09:31:00Z — REJECTED plan v1 — user re-invoked /kevin — previous session was WORKING
- 2026-06-16T09:30:53Z — Mapped repo for SPSE-5838: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-16T09:30:57Z — <@U0B42FAHQ6L>: /kevin SPSE-5838
- 2026-06-16 — Session 2: Added footer to both pages and welcome-page footer test.
- 2026-06-16T09:32:20Z — Kevin: ## READY: Added footer to both pages and a test for welcome page footer presence.
- 2026-06-16T09:32:20Z — AI emitted READY; transitioning to plan review.
- 2026-06-16T09:32:20Z — Kevin: ## READY: Added footer to both pages and a test for welcome page footer presence.
- 2026-06-16T09:31:08Z — Mapped repo for SPSE-5838: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-16T09:31:08Z — <@U0B42FAHQ6L>: /kevin SPSE-5838
- 2026-06-16T09:33:00Z — Implemented footer in both WelcomeController methods and added `welcomePageContainsFooter` test. Ship ready.
- 2026-06-16T09:32:25Z — Kevin: ## READY: Added footer (text + style) to welcome and shop pages + test for welcome page
- 2026-06-16T09:32:25Z — AI emitted READY; transitioning to plan review.
- 2026-06-16T09:32:25Z — Kevin: ## READY: Added footer (text + style) to welcome and shop pages + test for welcome page
- 2026-06-16T09:33:02Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-16T09:33:33Z — <@U0B42FAHQ6L> approved implementation; running test gate.
- 2026-06-16T09:33:51Z — <@U0B42FAHQ6L> requested test re-run
- 2026-06-16T09:33:55Z — <@U0B42FAHQ6L> approved implementation; running test gate.
