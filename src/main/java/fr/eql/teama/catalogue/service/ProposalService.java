package fr.eql.teama.catalogue.service;

import fr.eql.teama.catalogue.entities.Proposal;

import java.util.List;
import java.util.Optional;

public interface ProposalService {
    List<Proposal> getProposalList();
    Optional<Proposal> getProposalById(Integer id);
    List<Proposal> getProposalsByName(String name);
    Proposal addProposal(Proposal proposal);
    Proposal modifyProposal(Proposal proposal);
    void removeProposal(Integer id);
}
