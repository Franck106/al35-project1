package fr.eql.teama.catalogue.dao;

import fr.eql.teama.catalogue.entities.Proposal;
import fr.eql.teama.catalogue.entities.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProposalRepository extends CrudRepository<Proposal, Integer>, JpaSpecificationExecutor<Proposal> {
    List<Proposal> findAllByName(String name);
    List<Proposal> findAllByProvider(User provider);
}
