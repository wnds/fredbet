package de.fred4jupiter.fredbet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.fred4jupiter.fredbet.domain.FileStorage;

public interface FileStorageRepository extends JpaRepository<FileStorage, Long>{

}