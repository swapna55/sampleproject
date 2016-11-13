package org.niit.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.niit.model.CardDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class CardDetailDaoImpl implements CardDetailDao{

    @Autowired
    private SessionFactory sessionFactory;

    public void addCardDetail(CardDetail cardDetail) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cardDetail);

        session.flush();
    }

}
