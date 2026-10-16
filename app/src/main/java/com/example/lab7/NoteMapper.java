package com.example.lab7;

public class NoteMapper {

    // OOP -> Entity
    public static NoteEntity toEntity(Note note) {
        if (note instanceof TextNote) {
            return new NoteEntity(note.getTitle(), "text", null, ((TextNote) note).getContent(), note.getCreatedDate());
        } else if (note instanceof CheckListNote) {
            return new NoteEntity(note.getTitle(), "checklist", ((CheckListNote) note).getItem(), null, note.getCreatedDate());
        }
        return null;
    }

    // Entity -> OOP
    public static Note fromEntity(NoteEntity entity) {
        if ("text".equals(entity.type)) {
            return new TextNote(entity.title, entity.createdDate, entity.content);
        } else if ("checklist".equals(entity.type)) {
            return new CheckListNote(entity.title, entity.createdDate, entity.checklistItemsJson);
        }
        return null;
    }
}
