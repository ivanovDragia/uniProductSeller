import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import { NavBar } from "./components/nav-bar";
import { HomePage } from "./pages/home/home.page";
import { LoginPage } from "./pages/login/login.page";
import { RegisterPage } from "./pages/register/register.page";
import { ProfilePage } from "./pages/profile/profile.page";
import { AdminPage } from "./pages/admin/admin.page";
import { NotFoundPage } from "./pages/not-found/not-found.page";
import { UnauthorizedPage } from "./pages/unauthorized/unauthorized.page";
import { Role } from "./models/role";
import { AuthGuard } from "./guards/auth.guard";

function App() {
  return (
    <div>
      <BrowserRouter>
        <NavBar />
        <div className="container">
          <Routes>
            <Route path="/" element={<HomePage />} />
            <Route path="/home" element={<HomePage />} />
            <Route path="/login" element={<LoginPage />} />
            <Route path="/register" element={<RegisterPage />} />
            <Route
              path="/profile"
              element={
                <AuthGuard roles={[Role.ADMIN, Role.USER]}>
                  <ProfilePage />
                </AuthGuard>
              }
            />

            <Route
              path="/admin"
              element={
                <AuthGuard roles={[Role.ADMIN]}>
                  <AdminPage />
                </AuthGuard>
              }
            />
            <Route path="/404" element={<NotFoundPage />} />
            <Route path="/401" element={<UnauthorizedPage />} />
            <Route path="*" element={<NotFoundPage />} />
          </Routes>
        </div>
      </BrowserRouter>
    </div>
  );
}

export default App;
