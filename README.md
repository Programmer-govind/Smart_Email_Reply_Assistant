# Smart Email Reply Assistant 🚀  

**An AI-powered Smart Email Reply Assistant integrated with a live Chrome Extension**. This project uses advanced AI to provide contextually accurate email replies, saving time and improving communication efficiency.

## Features ✨  
- **AI-Driven Smart Replies**: Generate intelligent, context-aware email responses.  
- **Live Chrome Extension**: Seamless integration with Gmail to streamline email replies directly in your browser.  
- **Customizable Replies**: Tailor suggestions to match tone and style preferences.  
- **Modern UI**: User-friendly React.js interface for enhanced experience.  

## How It Works 💡  
1. **Chrome Extension**: Connects with Gmail to enable live AI-powered email reply generation.  
2. **Backend**: A robust Spring Boot application providing secure REST APIs to process emails and generate responses.  
3. **Frontend**: A React.js web application for managing user settings and interactions.  

## Technologies Used 🛠️  
- **Backend**: Spring Boot, REST APIs  
- **Frontend**: React.js  
- **AI/ML**: Gemini API  
- **Chrome Extension**: Chrome Extension APIs  

## Installation Guide 🖥️  
Follow these steps to set up the project locally:

### Clone the Repository  
```bash  
git clone https://github.com/Programmer-govind/Smart_Email_Reply_Assistant.git  
cd Smart_Email_Reply_Assistant  
```  

### Backend Setup (Spring Boot)  
1. Navigate to the `backend` directory:  
   ```bash  
   cd backend  
   ```  
2. Open the project in your preferred IDE (e.g., IntelliJ, Eclipse).  
3. Update application properties:  
   - Set the database credentials and OpenAI API key in `src/main/resources/application.properties`.  
4. Build and run the application:  
   ```bash  
   ./mvnw spring-boot:run  
   ```  

### Frontend Setup (React.js)  
1. Navigate to the `frontend` directory:  
   ```bash  
   cd ../frontend  
   ```  
2. Install dependencies:  
   ```bash  
   npm install  
   ```  
3. Start the development server:  
   ```bash  
   npm start  
   ```  

### Chrome Extension Setup  
1. Navigate to the `chrome-extension` directory:  
   ```bash  
   cd ../chrome-extension  
   ```  
2. Open Chrome and go to `chrome://extensions/`.  
3. Enable **Developer Mode**.  
4. Click **Load unpacked** and select the `chrome-extension` directory.  

## Usage 🚦  
1. Start the backend and frontend applications.  
2. Use the Chrome extension to log in to your account.  
3. Open Gmail and compose/reply to an email.  
4. Generate AI-based suggestions for replies and customize them as needed.  

## Future Enhancements 🌟  
- Multi-platform support for Outlook and other email services.  
- Enhanced AI for generating multilingual replies.  
- Fine-tuned personalization for user-specific preferences.  

## Contributing 🤝  
Contributions are welcome! Please fork the repository and submit a pull request with your updates.   

## Acknowledgments 🙌  
- OpenAI for AI integration.  
- Spring Boot and React.js communities for their powerful frameworks.  
- Chrome Developer Tools for seamless extension development.  

## Connect with Me 💬  
**Developer**: Gautam Govind  
- GitHub: [Programmer-govind](https://github.com/Programmer-govind)  
- LinkedIn: *(https://www.linkedin.com/in/gautam-govind-b92036256)*  
- Email: *(gautamgovind448@gmail.com)*  
