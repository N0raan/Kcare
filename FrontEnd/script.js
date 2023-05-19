const form = document.getElementById('login-form');
const username = document.getElementById('username');
const password = document.getElementById('password');
const error = document.querySelector('.error-msg');

form.addEventListener('submit', (event) => {
  event.preventDefault();
  if (username.value === '' || password.value === '') {
    error.textContent = 'Please enter a username and password';
  } else if (username.value !== 'example' || password.value !== 'password') {
    error.textContent = 'Incorrect username or password';
  } else {
    error.textContent = '';
    form.submit();
  }
});
