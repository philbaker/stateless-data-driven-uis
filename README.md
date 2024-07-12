# Stateless, data-driven UIs

## Notes

Based on a [talk](https://vimeo.com/861600197) and [article](https://cjohansen.no/stateless-data-driven-uis/) by Christian Johansen. Code is from [form-app](https://github.com/cjohansen/form-app)

### Intro
- Core idea is sepration of business and UI logic
- In this approach the component is a visual building block. It does not manage state, does not have behaviour. It takes data and renders a resulting visual snapshot.

### Form app
- UI components:
  - Generic, no side-effects
  - Easy to visualise UI states by passing different arguments to components
  - Common web app experience: 
    - To see a particular UI state: log in, go to specific page, clear cache, fix database etc
  - Live reload
- Business logic:
  - Validation and UI mapping functions
  - Pure, testable, no mocks
- Machinery: Atom (state management), UI re-render, event handling

### Advantages
- Easier to test logic and UI states
- Not tied to UI framework

### Disadvantages
- Less familiar than common React/Vue approach
- Potential performance issues

### Files

```md
README.md
src/main/app/ui/button.cljs
src/main/app/ui/date_input.cljs
src/main/app/ui/date_range_input.cljs
src/main/app/ui/date_form.cljs
src/main/app/form.cljs
src/main/app/core.cljs
test/main/app/form_test.cljs
```

## Setup

### Install dependencies
`npm install`

### Watch (dev)
- Shadow: `npm run shadow:watch`
- Tailwind: `npm run tailwind:watch`

### Release (prod)
- Shadow: `npm run shadow:release`
- Tailwind: `npm run tailwind:release`

### Tailwind intellisense support

```
 "tailwindCSS.experimental.classRegex": [
    ":class\\s+\"([^\"]*)\"",
    ":[\\w-.#>]+\\.([\\w-]*)"
  ],
  "tailwindCSS.includeLanguages": {
    "clojure": "html"
  }
```
