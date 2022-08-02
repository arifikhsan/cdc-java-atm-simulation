<%@tag description="Overall Page template" pageEncoding="UTF-8" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Very Good ATM</title>
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="">

<header class="p-4 bg-violet-600">
  <div class="max-w-screen-sm mx-auto">
    <p class="text-xl font-bold text-white text-center">Very Good ATM</p>
  </div>
</header>

<main class="bg-violet-50">
  <div class="p-4 max-w-screen-sm mx-auto">
    <jsp:doBody/>
  </div>
</main>

<footer class="p-4 bg-violet-800">
  <div class="max-w-screen-sm mx-auto">
    <p class="text-white text-center">@ATM Simulation 2022</p>
  </div>
</footer>

</body>
</html>
