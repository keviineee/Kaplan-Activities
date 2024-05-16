let currentslide = 0;

let images = [];

images[0] = 'Images/Sliderimage1.jpg';
images[1] = 'Images/Sliderimage2.jpg';
images[2] = 'Images/Sliderimage3.jpg';
images[3] = 'Images/Sliderimage4.jpg';

function imageChange() {
  document.getElementById('slider').src = images[currentslide];

  if (currentslide < images.length - 1) {
    currentslide++;
  }
  else {
    currentslide = 0;
  }

  setTimeout(imageChange, 2000)
}

window.onload = imageChange;