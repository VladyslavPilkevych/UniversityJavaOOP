# Task 1: Hash Table Implementation with Integer Keys and String Values

## Overview

This task demonstrates the implementation of a basic hash table where:

Key: Integer

Value: String

### Features

Collision Handling: Chaining using linked lists.

### Operations:

Insertion: Insert key-value pairs into the hash table.

Deletion: Remove a key-value pair based on the key.

Lookup: Retrieve the value associated with a key.

Hash Function: Computes the index using the modulo operation.

### How It Works

The hash table is implemented as an array of linked lists.

Each index represents a bucket where entries with the same hash value are stored.

Insertion, deletion, and lookup operate on the linked list in the corresponding bucket.

Running the Code

Execute the main method in HashTable class.

The output will display the state of the hash table before and after deletion, along with lookup results.

# 2: User Authentication System with Hash Table

## Overview

This task implements a hash table for storing user credentials and personal details:

Key: Username (String)

Value: Instance of the User class containing hashed password, first name, surname, and email.

### Features

User Class:

Attributes: username, hashedPassword, firstName, surname, and email.

Methods for setting and getting these attributes.

Hash Table:

Collision handling using chaining with linked lists.

Operations:

Insertion: Add or update user information.

Deletion: Remove a user by username.

Lookup: Retrieve user details and validate hashed password.

### How It Works

Hashing: The hash table computes bucket indices using the hash of the username.

Chaining: Each bucket contains a linked list to handle collisions.

Password Validation: During lookup, hashed passwords are compared to ensure authenticity.

Running the Code

Execute the main method in UserHashTable class.

The output will display:

State of the hash table with all users.

State after deleting a user.

Results of a lookup operation.