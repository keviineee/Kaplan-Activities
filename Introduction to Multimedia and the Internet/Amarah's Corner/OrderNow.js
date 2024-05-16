function submitForm() {

  
    const form = document.getElementById('orderForm');
    if (!form.checkValidity()) {
      alert('Please fill in all required fields.');
      return;
    }
    setTimeout(() => {
        form.reset();
      }, 2000);

    alert('Order placed successfully!\n\n');
}