<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Add User</title>

	<!-- TailwindCSS -->
	<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet" />

	<!-- AOS Animation -->
	<link href="https://unpkg.com/aos@2.3.4/dist/aos.css" rel="stylesheet">
	<script src="https://unpkg.com/aos@2.3.4/dist/aos.js"></script>
	<script>
		window.addEventListener('load', AOS.init);
	</script>
</head>

<body class="bg-gradient-to-br from-indigo-100 via-white to-blue-100 min-h-screen flex items-center justify-center px-4 py-8">

	<h:form prependId="false">
		<div data-aos="fade-down" data-aos-duration="1200"
			class="bg-white shadow-2xl rounded-3xl px-10 py-12 w-full max-w-md border border-indigo-300 space-y-6">

			<h2 class="text-3xl font-bold text-center text-indigo-700 mb-6">
				➕ Add New User
			</h2>

			<!-- Name Field -->
			<div>
				<label for="name" class="block text-sm font-medium text-gray-700 mb-1">👤 Name</label>
				<h:inputText id="name" value="#{ejbUser.name}"
					styleClass="w-full px-4 py-2 border rounded-xl shadow-sm focus:ring-2 focus:ring-indigo-300 focus:outline-none" />
				<h:message for="name" styleClass="text-red-500 text-sm mt-1" />
			</div>

			<!-- Email Field -->
			<div>
				<label for="email" class="block text-sm font-medium text-gray-700 mb-1">✉️ Email</label>
				<h:inputText id="email" value="#{ejbUser.email}"
					styleClass="w-full px-4 py-2 border rounded-xl shadow-sm focus:ring-2 focus:ring-indigo-300 focus:outline-none" />
				<h:message for="email" styleClass="text-red-500 text-sm mt-1" />
			</div>

			<!-- Submit Button -->
			<div class="text-center">
				<h:commandButton value="Add User"
					action="#{usercontroller.addUsercon(ejbUser)}"
					styleClass="bg-indigo-600 hover:bg-indigo-700 text-white font-semibold px-6 py-2 rounded-full shadow-md transition-all duration-300" />
			</div>
		</div>
	</h:form>

</body>
</html>
</f:view>
