package net.org.journalApp.repository;

import net.org.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository  extends MongoRepository<JournalEntry, ObjectId> {
}
