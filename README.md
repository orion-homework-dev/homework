# Homework - Notification Dispatch Service

Click **Use this template → Create a new repository**. Create a **private** repository under your own account and invite orion-homework-dev as a collaborator. Complete the assignment and send us your repository link. Please do not publish your solution or open a pull request against this template.

## Objective

Refactor the legacy code to a production ready solution for the notification dispatch service that is maintainable, readable, and scalable using modern practices.

This exercise is intended to be completed in approximately 4 hours.

The application sends `EMAIL`, `SMS`, and `PUSH` notifications, stores the outcome of those attempts, and enforces the operational safeguards already present in the system. 
The goal is to improve the design so the code is easier to understand, easier to extend, and more robust without changing the behavior that matters.

This is a design and refactoring exercise. The focus is on making a small system feel thoughtful, clean, and ready for change. 
It also acknowledges that existing API boundaries and persistence design may not be ideal and should be improved.

## System summary

The service is responsible for:

- sending notifications to different channels
- tracking the result of each attempt
- rejecting unsupported notification types
- rejecting blocked or rate-limited recipients
- recording failures and applying a simple rejection path after repeated problems

## Core expectations

The solution should be clear and defensible.

The project should demonstrate sound engineering judgment through:

- clear, readable code
- sensible use of current best practices
- no unnecessary complexity

## Behavior to preserve

The system must continue to support the existing notification types and operational safeguards:

- `EMAIL`
- `SMS`
- `PUSH`
- blocked or rate-limited recipients are rejected
- unsupported notification types fail clearly
- failures are tracked
- repeated failures eventually trigger a simple rejection path

## What matters most

We care about:

- correctness
- maintainability
- readability
- clear design decisions
- practical modernization
- scalability

## Development process

Please keep a record of the changes you make and why you make them. Preferably, use small, meaningful Git commits with messages that explain both the change and its rationale. Brief notes in the README can supplement the commit history, especially for trade-offs or alternatives you considered.

## Constraints

The solution must use Java and Spring Boot. You may upgrade the Java version and dependencies.

Everything else may be redesigned or rewritten, including the API, database schema, persistence approach, and project structure, provided the behavior described above is preserved.

Keep the solution proportional to the problem. The goal is to transform a small but messy system into something clean, understandable, and fit for future change.


## Bonus points

These are not required for the core task, but they can earn additional credit if included well:

- adding a update endpoint for notifications
- introducing a proper blacklist functionality to enforcement flow for blocked recipients
