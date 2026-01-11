package com.example.gitagyaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String home() {
        return """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Gita Gyaan for DevOps Engineers</title>
            <style>
                body {
                    font-family: 'Segoe UI', Arial, sans-serif;
                    background: linear-gradient(to right, #0f2027, #203a43, #2c5364);
                    color: #ffffff;
                    margin: 0;
                    padding: 0;
                }
                .container {
                    max-width: 900px;
                    margin: 40px auto;
                    background: rgba(0, 0, 0, 0.5);
                    padding: 30px;
                    border-radius: 12px;
                }
                h1 {
                    text-align: center;
                    color: #ffcc00;
                }
                h2 {
                    color: #00e5ff;
                    margin-top: 30px;
                }
                p {
                    font-size: 16px;
                    line-height: 1.7;
                }
                .shloka {
                    background: #1e1e1e;
                    border-left: 5px solid #ffcc00;
                    padding: 15px;
                    margin: 20px 0;
                    font-style: italic;
                }
                footer {
                    margin-top: 40px;
                    text-align: center;
                    font-size: 14px;
                    color: #cccccc;
                }
                .highlight {
                    color: #ffcc00;
                    font-weight: bold;
                }
            </style>
        </head>
        <body>
            <div class="container">
                <h1>🕉️ Gita Gyaan for DevOps Engineers 🕉️</h1>

                <p>
                    The <span class="highlight">Bhagavad Gita</span> teaches timeless wisdom that aligns deeply
                    with the mindset of a modern <span class="highlight">DevOps Engineer</span>.
                </p>

                <h2>📜 Shloka 1 – Focus on Action</h2>
                <div class="shloka">
                    कर्मण्येवाधिकारस्ते मा फलेषु कदाचन ।<br>
                    मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्मणि ॥
                </div>
                <p>
                    <strong>DevOps Meaning:</strong><br>
                    Focus on writing clean pipelines, stable infrastructure, and reliable automation.
                    Do not obsess over immediate results. Consistency brings success.
                </p>

                <h2>⚙️ Shloka 2 – Detachment from Failure</h2>
                <div class="shloka">
                    योगस्थः कुरु कर्माणि सङ्गं त्यक्त्वा धनञ्जय ।
                </div>
                <p>
                    <strong>DevOps Meaning:</strong><br>
                    Whether deployments succeed or fail, remain calm.
                    Learn from incidents, improve systems, and move forward.
                </p>

                <h2>🚀 Shloka 3 – Discipline & Automation</h2>
                <p>
                    Discipline is the heart of DevOps.
                    Automation, monitoring, and CI/CD pipelines are your <strong>Tapasya</strong>.
                </p>

                <h2>🔁 DevOps + Gita Philosophy</h2>
                <ul>
                    <li>Infrastructure as Code → Dharma</li>
                    <li>CI/CD Pipelines → Nishkama Karma</li>
                    <li>Monitoring & Alerts → Awareness</li>
                    <li>Incident Response → Calm Mind</li>
                </ul>

                <footer>
                    <p>
                        Created by <span class="highlight">Aniket Ghosh</span><br>
                        📞 Mobile: <span class="highlight">9851700200</span>
                    </p>
                </footer>
            </div>
        </body>
        </html>
        """;
    }
}
