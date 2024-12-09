package com.ccsw.tutorial_author.author;

import com.ccsw.tutorial_author.author.model.Author;
import com.ccsw.tutorial_author.author.model.AuthorDto;
import com.ccsw.tutorial_author.author.model.AuthorSearchDto;
import com.ccsw.tutorial_author.exceptions.AuthorNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ccsw
 *
 */
@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Page<Author> findPage(AuthorSearchDto dto) {

        return this.authorRepository.findAll(dto.getPageable().getPageable());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Author> findAll() {

        return (List<Author>) this.authorRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Author get(Long id) {

        //return authorRepository.findById(id).orElse(null);
        return authorRepository.findById(id).orElseThrow(() -> new AuthorNotFoundException("Author not exists"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Long id, AuthorDto dto) {

        Author author;

        author = (id == null) ? new Author() : this.get(id);

        BeanUtils.copyProperties(dto, author, "id");

        this.authorRepository.save(author);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Long id) {

       /* if (this.get(id) == null) {
            throw new AuthorNotFoundException("Author Not exists");
        }*/
        this.get(id);
        this.authorRepository.deleteById(id);

    }
}
