module.exports = {
  content: [
    "./src/**/**/*.cljs",
    "./portfolio/src/**/**/*.cljs",
  ],
  theme: {
    extend: {},
  },
  variants: {
    extend: {},
  },
  plugins: [
    require('@tailwindcss/forms'),
  ],
}
