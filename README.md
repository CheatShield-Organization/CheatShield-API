# CheatShield-API

---

## 1. Overview

The CheatShield-API serves as backend for the CheatShield ecosystem. 
The backend project goals are to ensure the session communication between 
the client and the anti-cheat system!

[!IMPORTANT] This project is currently in active development. APIs and endpoints are subject to change as we move toward a stable v1.0 release.

## 2. API Architecture & Services
The API is structured into modular services, each dedicated to a specific domain of the system.

| Services             | Purposes          | Key Feature                                                      |
|----------------------|-------------------|------------------------------------------------------------------|  
| /auth                | Security          | Authentication and authorization.                                |
| /email_configuration | Notifications     | Automated alerts and system updates via SMTP.                    |
| /exam                | Content manager   | Full CRUD operations for creating and structuring exams.         |
| /monitoring          | Settings manager  | Configuration of anti-cheat parameters and sensitivity settings. |
| /schedule            | Session Logistics | Managing exam.
| /exam_session        | Execution         | Real-time orchestration of active exam instances.
| /user                | Identity          | Management of student, professor and administrator profiles.
