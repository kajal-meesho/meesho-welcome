# KRD: SPSE-5839

## Ticket
- ID: SPSE-5839
- Title: Add a footer to all pages in meesho-welcome
- Status: Open
- Priority: Major
- Description: Add a consistent footer to GET / and GET /shop containing:
  - Text: "© 2026 Meesho. All rights reserved."
  - Pink background (#f43397), white text, full-width

Acceptance Criteria:
- GET / contains "© 2026 Meesho"
- GET /shop contains "© 2026 Meesho"
- A test asserts footer is present on welcome page

## Goal
Add a consistent footer to both the welcome and shop pages, styled as specified, and ensure a test asserts its presence.

## Decisions made
- Footer HTML: `<footer>© 2026 Meesho. All rights reserved.</footer>`
- Styling: Pink background (#f43397), white text, full-width, centered, 16px padding, margin-top for spacing.
- Footer included on both `/` and `/shop` HTML responses.
- Test added to assert footer is present on welcome page.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1781604653.045619
- userId: U0B42FAHQ6L
- batchTotal: 1
- testStatus: PASS
- testReportSummary: Maven run finished cleanly in 5s (no tests reported)

## History
- 2026-06-16T10:10:56Z — Mapped repo for SPSE-5839: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-16T10:11:01Z — <@U0B42FAHQ6L>: /kevin SPSE-5839
- 2026-06-16T10:16:00Z — Footer added to both pages, styled as specified, with test asserting presence on welcome page.
- 2026-06-16T10:11:16Z — Kevin: ## READY: Footer added to both pages, styled as specified, with test asserting presence on welcome page.
- 2026-06-16T10:11:16Z — AI emitted READY; transitioning to plan review.
- 2026-06-16T10:11:44Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-16T10:12:15Z — <@U0B42FAHQ6L> approved implementation; running test gate.
