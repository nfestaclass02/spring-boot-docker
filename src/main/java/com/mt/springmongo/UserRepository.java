package com.mt.springmongo;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Repository for saving new and retrieving existing {@link User}s from MongoDB
 *
 * @author Nfestatech
 */
public interface UserRepository extends PagingAndSortingRepository<User, String> {
}
