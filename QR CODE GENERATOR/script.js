let input = document.getElementById("url")
let btn = document.getElementById("qr_btn")
btn.addEventListener("click",()=>{
    let qrLink = `https://image-charts.com/chart?
chs=150x150&cht=qr&chl=${input.value}`
let qr_img = document.getElementById("qr_img")
qr_img.src=qrLink
})