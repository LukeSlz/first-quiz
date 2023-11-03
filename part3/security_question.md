## Recommendations for improving the security of the system
### Broken Access Control
First of all, it would be critical to implement role-based access control and assign users/employees to roles with the appropiate permissions. This should be reviewed regularly.
For this I would review access control permissions regularly to ensure that they are still appropriate.
Set alerts to admins on access control failures would be important here as well.
### Cryptographic Failure
The use of strong encryption algorithms and key management practices should be implemented within the team.
Following the previous section, the authentication of users should be done before granting access to encrypted data.
### Injection
Using parameterized queries or ORM libraries would be a good way to prevent SQL injection attacks.
### Insecure Design
Implement security language control (testing) throughout the development lifecycle and integrate it into user stories
### Security Missconfiguration
Deeply check and make sure that all system components are configured securely. This includes the web server, database server, and Kubernetes cluster.
Make it a practice sending Security Headers (and other directives) to clients.
### Vulnerable and Outdated Components
I would direct the team to remove unused dependencies, unnecessary features, components, files, and documentation.ents.
Also to Keep all software components up to date with the latest security patches.
### Identification and Authentication Failures
Enforce the implementation of multi-factor authentication methods on all users and implement secure session management practices
### Software and Data Integrity Failures
Review and confirm the use of a Secure Development Lifecycle and ensure that there is a review process for code and configuration changes. If there is none, I would assign people to that specific task
### Security Logging and Monitoring Failures
It'd be important to monitor the logs in order to check for suspicious activity. If it's not already done, ensure that all login, access control, and server-side input validation failures can be logged with sufficient user context to identify suspicious or malicious accounts.
### Server-Side Request Forgery (SSRF)
The main step is to enforce the "deny by default" policy and limit all but the essential intranet trafic. This can be done with a whitelist
The team would be responsible of setting a validation for all user-supplied URLs before making HTTP requests and disable its redirections.