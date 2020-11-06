package com.github.order.api.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.validation.Valid;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.github.order.api.entities.enuns.Status;

import lombok.Data;

@Entity
@Data
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private UUID id;
	
	@NotEmpty
	private String custumerId;
	
	@FutureOrPresent
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDateTime date;
	
	@NotEmpty
	private Status status;
	
	@Valid
	@OneToMany
	private Set<Item> itens;
	
	@PrePersist
	private void setUp() {
		id = UUID.randomUUID();
	}
}
