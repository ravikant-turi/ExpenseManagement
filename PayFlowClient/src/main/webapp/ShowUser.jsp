<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>User Records</title>

	<!-- TailwindCSS -->
	<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

	<!-- AOS Animation -->
	<link href="https://unpkg.com/aos@2.3.4/dist/aos.css" rel="stylesheet">
	<script src="https://unpkg.com/aos@2.3.4/dist/aos.js"></script>
	<script>
		window.addEventListener('load', AOS.init);
	</script>
</head>

<body class="bg-gradient-to-br from-gray-100 to-indigo-200 min-h-screen flex items-center justify-center p-6">

	<h:form>
		<div data-aos="fade-up" data-aos-duration="1000"
			class = "w-full max-w-5xl bg-white rounded-2xl shadow-2xl p-8 border border-indigo-300">

			<h1 class="text-4xl font-bold text-center text-indigo-800 mb-10 tracking-wider">
				📋 User Records
			</h1>

			<h:dataTable value="#{usercontroller.showUserlist()}" var="u"
				styleClass="min-w-full text-gray-800 divide-y divide-gray-300 text-sm"
				headerClass="bg-indigo-600 text-white px-4 py-3 text-left font-semibold"
				rowClasses="bg-white hover:bg-indigo-50 transition-all duration-200 px-4 py-2">

				<h:column>
					<f:facet name="header">
						<h:outputText value="🆔 User ID"/>
					</f:facet>
					<h:outputText value="#{u.id}" />
				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="👤 Name"/>
					</f:facet>
					<h:outputText value="#{u.name}" />
				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="✉️ Email"/>
					</f:facet>
					<h:outputText value="#{u.email}" />
				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="📅 Created At"/>
					</f:facet>
					<h:outputText value="#{u.createdAt}" />
				</h:column>

			</h:dataTable>
		</div>
	</h:form>

</body>
</html>
</f:view>
