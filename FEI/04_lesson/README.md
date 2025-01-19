<h1>Names and Surnames Management & User Management in Java</h1>

<p>This project provides two Java programs demonstrating how to manage data using <code>ArrayLists</code>. The first part is a simple program to handle names and surnames, while the second part introduces a <code>User</code> class with multiple attributes and shows how to add, update, and remove users from an <code>ArrayList</code>.</p>

<h2 id="features">Features</h2>
    <ul>
        <li>Manage names and surnames using <code>ArrayList&lt;String&gt;</code></li>
        <li>Add, delete, and search for names and surnames</li>
        <li>Create and manage a list of <code>User</code> objects with various attributes</li>
        <li>Update, delete, and display user details</li>
    </ul>

<h2 id="part-1-names-and-surnames-management">Part 1: Names and Surnames Management</h2>

<h3>Description</h3>
    <p>The <code>NamesAndSurnames</code> class manages a list of names and their corresponding surnames using two <code>ArrayList&lt;String&gt;</code> objects. It supports:</p>
    <ol>
        <li><strong>Adding a New Name and Surname</strong>: Users can add a new name and surname pair.</li>
        <li><strong>Deleting a Name and Surname</strong>: Users can delete a name and its corresponding surname.</li>
        <li><strong>Searching for a Name</strong>: Users can search for a name and see its associated surname.</li>
        <li><strong>Displaying the Updated List</strong>: After each operation, the list of names and surnames is displayed.</li>
    </ol>

<h3>Example Data</h3>
    <p>The program starts with a pre-filled list of 10 names and surnames.</p>

<h2 id="part-2-user-management-with-user-class">Part 2: User Management with User Class</h2>

<h3>Description</h3>
    <p>The <code>Main</code> class manages user information by storing instances of the <code>User</code> class in an <code>ArrayList&lt;User&gt;</code>. Each <code>User</code> object has multiple attributes:</p>
    <ul>
        <li><strong>Attributes</strong>: <code>name</code>, <code>age</code>, <code>surname</code>, <code>registrationDate</code>, <code>phoneNumber</code>, <code>email</code>, and <code>country</code></li>
        <li><strong>Add New User</strong>: Prompts the user to enter details and adds a new <code>User</code> to the list.</li>
        <li><strong>Update User</strong>: Changes the name of the second user based on user input.</li>
        <li><strong>Remove User</strong>: Deletes the third user in the list.</li>
        <li><strong>Display User Details</strong>: Displays all users currently in the list.</li>
    </ul>

<h3>Example Data</h3>
    <p>The program starts with five pre-defined users.</p>
