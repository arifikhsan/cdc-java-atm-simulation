<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="tag" tagdir="/WEB-INF/tags" %>

<tag:layout>
  <jsp:body>

    <form method="post" action="auth/login" class="py-24 mb-0">
      <div class="mb-6">
        <label for="accountNumber" class="block mb-2 text-sm font-medium text-violet-900">
          Account Number
        </label>
        <input
                id="accountNumber"
                class="bg-violet-50 border border-violet-300 text-violet-900 text-sm rounded-lg focus:ring-violet-500 focus:border-violet-500 block w-full p-2.5"
                placeholder="Enter your account number"
                required
        >
      </div>
      <div class="mb-6">
        <label for="password" class="block mb-2 text-sm font-medium text-violet-900">
          Personal Identification Number
        </label>
        <input
                type="password"
                id="password"
                class="bg-violet-50 border border-violet-300 text-violet-900 text-sm rounded-lg focus:ring-violet-500 focus:border-violet-500 block w-full p-2.5"
                placeholder="Enter your PIN"
                required
        >
      </div>
      <button
              type="submit"
              class="text-white bg-violet-700 hover:bg-violet-800 focus:ring-4 focus:outline-none focus:ring-violet-300 font-medium rounded-lg text-sm w-full sm:w-auto px-5 py-2.5 text-center">
        Submit
      </button>
    </form>

  </jsp:body>
</tag:layout>
