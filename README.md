# spring-strategy-pattern

1. **Context**: The Context assigns tasks to a strategy object and maintains a reference to it, acting as an intermediary between the client and the strategy for task execution without exposing details.

2. **Strategy Interface**: Defines methods that all concrete strategies must implement, ensuring interchangeable strategies and promoting flexibility by decoupling the Context from specific strategies.

3. **Concrete Strategies**: Implement the Strategy Interface, providing specific algorithms or behaviors for executing the task. They are interchangeable and selected based on task requirements.

4. **Client**: Selects and configures the appropriate strategy, passing it to the Context to execute the task according to the client’s needs.
