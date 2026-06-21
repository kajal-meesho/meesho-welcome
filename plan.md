# KRD: SPSE-5860

## Ticket
- ID: SPSE-5860
- Title: Add /sell endpoint and "Become a Seller" link on homepage
- Status: Open
- Priority: Major
- Description: Background: The meesho-welcome Spring Boot app currently has three endpoints: / (homepage), /shop, and /health. All pages share the same visual style — pink (#f43397) header, light purple background (#f8f3ff), white card in the center. The homepage has one CTA button ("Start shopping") that links to /shop.
Goal: Add a seller-facing landing page at /sell and surface it from the homepage with a secondary CTA.
Page structure for /sell:
Same header and card layout as the existing pages
Heading: "Become a Seller"
A short intro line followed by a bullet list of 3 seller benefits (free logistics, wide reach, zero commission — exact wording is up to the implementer)
A primary CTA button: "Register now" (links to /)
A secondary back link: "← Back to home" (links to /)
Accent color for this page's heading and primary CTA should be purple (#7c3aed) to visually distinguish it from the buyer-facing pink pages
Change to / homepage: Add a second CTA button next to the existing "Start shopping" button. This new button should say "Become a Seller →" and link to /sell. It should use the purple accent (#7c3aed) so it is visually distinct from the pink "Start shopping" button. No other changes to the homepage.
Tests: Add 3 new test methods to the existing WelcomeControllerTest class following the same pattern as the 4 existing tests (MockMvc perform(get(...)) → assert status 200 → assert response body contains a key string):
GET /sell returns 200 and body contains "Become a Seller"
GET /sell body contains at least one benefit keyword (e.g. "commission" or "logistics")
GET / body contains "Become a Seller" (verifying the new homepage link)
Do not modify any existing tests.
README: Add an ## Endpoints table listing all 4 endpoints (/, /shop, /sell, /health) with their descriptions.
Acceptance Criteria:
mvn test passes — all 7 tests green (4 existing + 3 new)
/sell is visually consistent with /shop (same header, same card layout, same font)
Purple accent is used on /sell heading, CTA, and the homepage "Become a Seller" button
No existing endpoints or tests are modified
Files changed: WelcomeController.java, WelcomeControllerTest.java, README.md

## Goal
Add a /sell endpoint with a purple-accented seller landing page, and surface a purple "Become a Seller" CTA on the homepage. Add 3 new tests for /sell and the new homepage link. Document all endpoints in README.

## Decisions made
- /sell page uses purple (#7c3aed) for heading and primary CTA, and matches shop page layout.
- Seller benefits: "Free logistics & doorstep pickup", "Zero commission on all products", "Access to a wide customer base".
- Homepage "Become a Seller →" button uses purple accent and sits next to "Start shopping".
- 3 new tests added to WelcomeControllerTest, following the pattern of existing tests.
- README updated with an Endpoints table for all 4 endpoints.

## Open doubts
_(none)_

## Current proposal
- See `src/main/java/com/meesho/welcome/WelcomeController.java` (java)
- See `src/test/java/com/meesho/welcome/WelcomeControllerTest.java` (java)

## State
- state: TESTS_RUNNING
- prNumber: 14
- prUrl: https://github.com/kajal-meesho/meesho-welcome/pull/14
- branch: feature/spse-5860-ai-summary
- targetRepo: https://github.com/kajal-meesho/meesho-welcome
- channelId: C0B5ZQF12Q2
- threadTs: 1782003648.124679
- userId: U0B42FAHQ6L
- testStatus: PASS
- testReportSummary: 10/10 tests passed in 5s
- mergeCommitSha: 6b2472fc5726582f8f49d343d225e7aedee200b9
- dockerImage: kevin/spse-5860:c6b2472fc
- canaryContainerId: kevin-spse-5860-canary
- stableContainerId: kevin-spse-5860-stable
- canaryPort: 8082
- stablePort: 8080
- canaryStartedAt: 2026-06-21T01:11:26Z
- lastVerdict: ROLLBACK
- lastVerdictReason: manual override by <@U0B42FAHQ6L>
- evaluatorTicks: 2
- feedbackQueueJson: W3sic291cmNlIjoiU2xhY2siLCJnaENvbW1lbnRJZCI6bnVsbCwiZ2hVc2VyTG9naW4iOm51bGwsImJvZHkiOiJUaGUgL3NlbGwgcGFnZSBjb2xvdXIgc2VwYXJhdGlvbiBpcyBhIG5pY2UgdG91Y2gg4oCUIHVzaW5nICM3YzNhZWQgcHVycGxlIGZvciB0aGUgc2VsbGVyIENUQSB3aGlsZSBrZWVwaW5nIHRoZSBidXllciBmbG93IG9uICNmNDMzOTcgcGluayBtYWtlcyB0aGUgdHdvIGF1ZGllbmNlcyB2aXN1YWxseSBkaXN0aW5jdCB3aXRob3V0IGludHJvZHVjaW5nIGEgbmV3IGxheW91dC4gQ2xlYW4gZGVjaXNpb24uIiwic2tpcFJlYXNvbiI6bnVsbCwic2tpcHBlZEF0IjpudWxsfV0=
- activeFeedbackIndex: 0
- feedbackPlanPanelTs: 1782004393.433719
- feedbackImplPanelTs: 1782004418.600449
- feedbackActivePlanText: No code changes needed; feedback is positive and affirms the design decision.\n\n- The Slack feedback is purely positive, commending the use of #7c3aed purple for the seller CTA and the visual distinction between seller and buyer flows.\n- No changes are requested or implied by the feedback.\n- No files need to be modified.\n- Plan: Acknowledge the feedback as affirmation of the current implementation; no action required.
- feedbackActiveImplText: No code changes needed; feedback is positive and affirms the color separation and CTA design.

## History
- 2026-06-21T01:00:52Z — Mapped repo for SPSE-5860: https://github.com/kajal-meesho/meesho-welcome
- 2026-06-21T01:00:58Z — <@U0B42FAHQ6L>: /kevin SPSE-5860
- 2026-06-21T01:10:00Z — Implemented /sell endpoint, purple-accented seller CTA on homepage, 3 new tests, and endpoints table in README; emitting READY.
- 2026-06-21T01:01:25Z — Kevin: ## READY: Added /sell endpoint, purple-accented seller CTA on homepage, 3 new tests, and endpoints table in README.
- 2026-06-21T01:01:25Z — AI emitted READY; transitioning to plan review.
- 2026-06-21T01:01:55Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-21T01:06:43Z — <@U0B42FAHQ6L> requested revision at plan: Write the complete content of every file from top to bottom. Do not use // ..., // existing code, // rest remains the same, <!-- existing -->, or any placeholder shortcut of any kind. Every line of every file must be written out in full — including all unchanged lines. If a file has 70 lines, write all 70 lines. If you cannot write a complete file, do not write that file at all.
- 2026-06-21T01:06:52Z — <@U0B42FAHQ6L>: User reviewed the plan and asked you to revise: Write the complete content of every file from top to bottom. Do not use // ..., // existing code, // rest remains the same, <!-- existing -->, or any placeholder shortcut of any kind. Every line of every file must be written out in full — including all unchanged lines. If a file has 70 lines, write all 70 lines. If you cannot write a complete file, do not write that file at all. — please update the plan/code, keep approved decisions intact, and emit ## READY again.
- 2026-06-21T01:10:00Z — AI implemented: All files written in full, no placeholders; emitting READY.
- 2026-06-21T01:07:28Z — Kevin: ## READY: Added /sell endpoint, purple-accented seller CTA on homepage, 3 new tests, and endpoints table in README — all files written in full.
- 2026-06-21T01:07:28Z — AI emitted READY; transitioning to plan review.
- 2026-06-21T01:07:47Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-21T01:08:12Z — <@U0B42FAHQ6L> approved implementation; running test gate.
- 2026-06-21T01:08:40Z — PR opened at https://github.com/kajal-meesho/meesho-welcome/pull/14
- 2026-06-21T01:11:00Z — <@U0B42FAHQ6L> clicked Merge; PR #14 merged at 6b2472fc5726582f8f49d343d225e7aedee200b9
- 2026-06-21T01:11:26Z — Canary live on localhost:8082 (image kevin/spse-5860:c6b2472fc)
- 2026-06-21T01:12:11Z — <@U0B42FAHQ6L> force-rolled-back canary
- 2026-06-21T01:12:45Z — <@U0B42FAHQ6L> started interactive feedback loop: 1 item(s)
- 2026-06-21T01:13:00Z — Slack feedback received: positive affirmation of color separation and CTA design; no changes required.
- 2026-06-21T01:13:12Z — Kevin: feedback plan 1/1: No code changes needed; feedback is positive and affirms the design decision.
- The Slack feedback is purely positive, commending the use of #7c3aed purple for the seller CTA and the visual distincti…
- 2026-06-21T01:13:17Z — <@U0B42FAHQ6L> approved feedback plan 1
- 2026-06-21T01:13:30Z — AI acknowledged positive feedback; no code changes needed; emitting READY.
- 2026-06-21T01:13:35Z — Kevin: feedback impl 1/1: No code changes needed; feedback is positive and affirms the color separation and CTA design.
- 2026-06-21T01:13:46Z — <@U0B42FAHQ6L> approved feedback impl 1
