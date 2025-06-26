A real-world **Full Stack Food Delivery Application** built using **React, Spring Boot, MongoDB**, with features like **Razorpay Payment Gateway**, **AWS S3 Image Upload**, **Admin Panel**, **Secure REST APIs**, and **Bootstrap 5 UI**. This project demonstrates a robust web development stack suitable for e-commerce and online ordering systems.


## Tech Stack

### Frontend
- React (with Vite)
- React Router DOM
- Bootstrap 5
- Axios
- Razorpay Integration
- AWS S3 for image upload
- Secure Routes & Form Validation

### Backend
- Spring Boot
- Spring Data MongoDB
- Spring Security
- REST API
- Razorpay Server-side Verification
- AWS SDK for S3
- JWT Authentication


## Features-----

### User Panel
- User registration and login (JWT-secured)
- Browse food items
- Add to cart functionality
- Cart page & order summary
- Checkout with Razorpay
- Order tracking and history

### Admin Panel
- Admin login
- CRUD operations on food items
- Upload product images to AWS S3
- Manage orders
- Dashboard with statistics

### Security
- Secure REST APIs with Spring Security
- JWT-based authentication & authorization
- Protected admin and user routes

---

## MongoDB Collections

- `users` – User and admin data
- `products` – Food items
- `orders` – Order details
- `carts` – Shopping cart items

---

## Razorpay Payment Flow

1. Frontend invokes Razorpay checkout.
2. Backend verifies payment via Razorpay API.
3. On success, order is confirmed and stored in the DB.

---

## AWS S3 Image Upload

- Admin can upload food images to AWS S3.
- Secure upload using AWS SDK and access keys.
- Image URLs are stored and rendered in the UI.


## Run Locally

### Backend (Spring Boot)
```bash
cd backend
./mvnw spring-boot:run

### Frontend (React + Vite)
bash
Copy
Edit
cd frontend
npm install
npm run dev
