# Homework - Notification Dispatch Service

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

## Constraints

Keep the solution proportional to the problem.

The goal is to transform a small but messy system into something clean, understandable, and fit for future change.

## Bonus points

These are not required for the core task, but they can earn additional credit if included well:

- adding a update endpoint for notifications
- introducing a proper blacklist functionality to enforcement flow for blocked recipients