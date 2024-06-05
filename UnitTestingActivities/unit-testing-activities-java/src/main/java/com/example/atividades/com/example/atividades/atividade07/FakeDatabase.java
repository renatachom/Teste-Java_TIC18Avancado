package com.example.atividades.atividade07;

public class FakeDatabase {
    private boolean userSaved = false;

    public void saveUser(User user) {
        // Simula a lógica de salvar o usuário
        userSaved = true;
    }

    public boolean isUserSaved(User user) {
        return userSaved;
    }
}

