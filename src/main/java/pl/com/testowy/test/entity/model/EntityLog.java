package pl.com.testowy.test.entity.model;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
public abstract class EntityLog {

    @Column(name = "CREATED_BY", updatable = false)
    @CreatedBy
    @Getter
    protected String createdBy;

    @Getter
    @LastModifiedBy
    @Column(name = "MODIFIED_BY")
    protected String modifiedBy;

    @Getter
    @CreatedDate
    @Column(name = "CREATION_TIMESTAMP", updatable = false)
    protected LocalDateTime creationTimestamp;

    @Getter
    @LastModifiedDate
    @Column(name = "MODIFICATION_TIMESTAMP")
    protected LocalDateTime modificationTimestamp;

    @PrePersist
    public void prePersist() {
        this.createdBy = createdBy;
        this.modifiedBy = createdBy;
        this.creationTimestamp = LocalDateTime.now();
        this.modificationTimestamp = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.modifiedBy = UUID.randomUUID().toString();
        this.modificationTimestamp = LocalDateTime.now();
    }

    protected void modified() {
        this.modificationTimestamp = LocalDateTime.now();
    }
}
