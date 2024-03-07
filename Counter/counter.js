// let radius;
// let circumference;

// document.getElementById("decrease").onclick = function() {
//   if (cnt > 0) { cnt -= 1; }
//   document.getElementById("count").textContent = String(cnt);
// }
// document.getElementById("reset").onclick = function() {
//   cnt = 0;
//   document.getElementById("count").textContent = String(cnt);
// }
// document.getElementById("increase").onclick = function() {
//   cnt += 1;
//   document.getElementById("count").textContent = String(cnt);
// }

const decrease = document.getElementById("decrease");
const increase = document.getElementById("increase");
const reset = document.getElementById("reset");
const countLabel = document.getElementById("count");
let cnt = 0;

increase.onclick = function() { cnt++; countLabel.textContent = cnt; }
decrease.onclick = function() { cnt--; countLabel.textContent = cnt; }
reset.onclick = function() { cnt=0; countLabel.textContent = cnt; }
