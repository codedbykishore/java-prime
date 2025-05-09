#!/bin/bash

# Check if the user provided a file name argument
if [ -z "$1" ]; then
    echo "Usage: $0 <JavaFileName>"
    exit 1
fi

# Set the Java file based on the argument provided
JAVA_FILE="$1"

# Ensure the file exists
if [ ! -f "$JAVA_FILE" ]; then
    echo "File $JAVA_FILE not found!"
    exit 1
fi

while true; do
    inotifywait -e close_write "$JAVA_FILE"
    clear
    echo "Running $JAVA_FILE..."
    java "$JAVA_FILE"
done
