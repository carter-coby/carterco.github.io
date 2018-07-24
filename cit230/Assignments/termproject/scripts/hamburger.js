function testAlert() {
    document.getElementById("menu").classList.toggle("hide")
    if (window.innerWidth < 600)
        {
        if (document.getElementById("menu").offsetWidth == 0)
            {
                document.getElementById("menubutton").style.width = "44px"
            }
        else
            {
                document.getElementById("menubutton").style.width = "100%"
            }
        }
}